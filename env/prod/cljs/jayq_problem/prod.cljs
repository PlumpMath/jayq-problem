(ns jayq-problem.prod
  (:require [jayq-problem.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
