(ns beautify-web.core-test
  (:require [clojure.test :refer :all]
            [beautify-web.core :refer :all]))

(deftest html-test
  (is (=
       (beautify-html "<ul class=\"nav navbar-nav\"><li class=\"active\"><a href=\"/\">Hauptseite</a></li><li><a href=\"/preise\">Preise</a></li><li><a href=\"/kontakt\">Kontakt</a></li></ul>")
         "<ul class=\"nav navbar-nav\">
    <li class=\"active\"><a href=\"/\">Hauptseite</a></li>
    <li><a href=\"/preise\">Preise</a></li>
    <li><a href=\"/kontakt\">Kontakt</a></li>
</ul>")))


(deftest js-test
  (is (=
       (beautify-js "$(function() {$('.lazy').Lazy({beforeLoad: function(element) {console.log(\"lazy loading images\");}, onError: function(element) {console.warn(\"error lazy loading element\", element);}});});")
       "$(function() {
    $('.lazy').Lazy({
        beforeLoad: function(element) {
            console.log(\"lazy loading images\");
        },
        onError: function(element) {
            console.warn(\"error lazy loading element\", element);
        }
    });
});")))

(deftest css-test
  (is (=
       (beautify-css "html{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%}")
       "html {
    font-family: sans-serif;
    -ms-text-size-adjust: 100%;
    -webkit-text-size-adjust: 100%
}")))
