package game;

interface Observer {
    void update(String message);
}

class ArenaObserver implements Observer {
    private String observerName;

    public ArenaObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(String message) {
    }
}
