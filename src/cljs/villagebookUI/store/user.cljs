(ns villagebookUI.store.user
  (:require [reagent.core :as r]
            [villagebookUI.store.state :refer [state]]))

(def user
  (r/cursor state [:user]))

(defn add! [userdata]
  (swap! user assoc :data userdata))

(defn read []
  (:data @user))

(defn fetched! []
  (swap! user assoc :fetched true))

(defn fetching! []
  (swap! user assoc :fetched false))

(defn fetched? []
  (:fetched @user))

(defn init! []
  (reset! user {:data    {}
                :fetched false}))
