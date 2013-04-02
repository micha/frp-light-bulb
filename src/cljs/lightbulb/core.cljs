(ns lightbulb.core
  (:require-macros
    [tailrecursion.javelin.macros :refer [cell mirror]]) 
  (:require
    [tailrecursion.javelin :as j])
  
  )

(defn between [x low high]
  (min high (max low x)))

(def sunlight-intensity   (cell 0))
(def v-photocell-target   (cell 0))

(def v-bulb               (cell (between (- v-photocell-target sunlight-intensity) 0 10)))
(def v-photocell          (cell (+ sunlight-intensity v-bulb)))

(cell (.log js/console "[tgt]" (pr-str [v-photocell-target v-photocell v-bulb sunlight-intensity])))
