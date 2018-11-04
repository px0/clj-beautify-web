(defproject px0/beautify-web "0.1.1"
  :description "Make HTML/CSS/JS strings pretty like you always wanted!"
  :url "https://github.com/px0/clj-beautify-web"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :deploy-repositories [["clojars"  {:sign-releases false :url "https://clojars.org/repo"}]
                        ]
  :release-tasks [["deploy"]])
