(defproject project "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring "1.2.0"]]
  :plugins [[lein-ring "0.12.6"]]
  :ring {:handler project.core/full-handler
         :init project.core/on-init
         :destroy project.core/on-destroy}
  :repl-options {:init-ns project.core})
