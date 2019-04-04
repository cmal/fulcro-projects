(ns first-demo.client-test-main
  (:require first-demo.tests-to-run
            [fulcro-spec.selectors :as sel]
            [fulcro-spec.suite :as suite]))

(enable-console-print!)

(suite/def-test-suite client-tests {:ns-regex #"first-demo..*-spec"}
  {:default   #{::sel/none :focused}
   :available #{:focused}})

