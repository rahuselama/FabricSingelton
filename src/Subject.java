public interface Subject {
    void addPotentialTenant(Observer observer);
    void removePotentialTenant(Observer observer);
    void notifyPotentialTenant();
}

