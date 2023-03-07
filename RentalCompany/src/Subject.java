interface Subject {

    // attach method
    void addPotentialTenant(Observer observer);

    // detach method
    void removePotentialTenant(Observer observer);

    // notify the observer
    void notifyPotentialTenant();
}
