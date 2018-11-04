(defproject beautify-web "0.1.0-SNAPSHOT"
  :description "Make HTML/CSS/JS strings pretty like you always wanted!"
  :url "https://github.com/px0/clj-beautify-web"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :deploy-repositories [["releases"  {:sign-releases false :url "https://clojars.org"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org"}]])
