(defproject frp-light-bulb "1.0.0-SNAPSHOT"
  :description  "Do we need loops in Javelin?"
  :license      {:name "Do whatever you want with this."}
  :plugins      [[tailrecursion/lein-hlisp      "1.0.0"]]
  :dependencies [[tailrecursion/hlisp-reactive  "1.0.2-SNAPSHOT"]
                 [tailrecursion/hlisp-macros    "1.0.0"]
                 [tailrecursion/hlisp-util      "0.1.0-SNAPSHOT"]]
  :eval-in      :leiningen
  :hlisp        {:html-src    "src/html"
                 :cljs-src    "src/cljs"
                 :html-out    "resources/public"
                 :base-dir    nil
                 :cljsc-opts  {:pretty-print   true
                               :optimizations  :whitespace
                               :warnings       true}})
