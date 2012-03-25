(defproject lein-webrepl "0.1.0-SNAPSHOT"
  :description "A Leiningen plugin to use browser based nREPL interface"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.3.0"]
                 [ring/ring-jetty-adapter "1.0.1"]
                 [ringmon "0.1.2-SNAPSHOT"]
                 [leiningen-core "2.0.0-SNAPSHOT"]]

  :eval-in-leiningen  true)