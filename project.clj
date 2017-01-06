(defproject cljds/ch2 "0.1.0"
  :description "Example code for the book Clojure for Data Science"
  :url "https://github.com/clojuredatascience/ch2-inference"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.293"]
                 [incanter/incanter "1.5.7"]
                 [medley "0.8.4"]
                 [clj-time "0.13.0"]
                 [b1 "0.3.3"]
                 [reagent "0.6.0"]]
  :resource-paths ["data"]
  :plugins [[lein-cljsbuild "1.1.5"]]
  :aot [cljds.ch2.core]
  :main cljds.ch2.core
  :repl-options {:init-ns cljds.ch2.examples}
  :profiles {:dev {:dependencies [[org.clojure/tools.cli "0.3.5"]]}}
  
  :cljsbuild {:builds {
            :client {:source-paths ["src"]
             :compiler
             {
              :main cljds.ch2.app
              :preamble ["reagent/react.js"]
              :output-dir "target/app"
              :output-to "target/app.js"
              :pretty-print true}}}})
