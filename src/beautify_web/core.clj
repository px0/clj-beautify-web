(ns beautify-web.core
  (:import [javax.script ScriptEngineManager Invocable])
  (:require [clojure.java.io :as io]))

(def js-engine
  (let [nashorn (.. (ScriptEngineManager.) (getEngineByName "nashorn"))]
    (.eval nashorn "var window = this;")
    (.eval nashorn (slurp (io/resource "beautify-1.8.8.js")))
    (.eval nashorn (slurp (io/resource "beautify-css-1.8.8.js")))
    (.eval nashorn (slurp (io/resource "beautify-html-1.8.8.js")))
    nashorn))

(defn invoke-window-method
  "Returns the given HTML string properly formatted"
  [^String method & arguments]
  (-> (.invokeMethod ^Invocable js-engine
                     (.eval js-engine "window")
                     method
                     (object-array arguments))))

(defn beautify-html
  "Returns the given HTML string properly formatted"
  [html-string]
  (invoke-window-method "html_beautify" html-string))

(defn beautify-css
  "Returns the given CSS string properly formatted"
  [css-string]
  (invoke-window-method "css_beautify" css-string))

(defn beautify-js
  "Returns the given JS string properly formatted"
  [js-string]
  (invoke-window-method "js_beautify" js-string))
