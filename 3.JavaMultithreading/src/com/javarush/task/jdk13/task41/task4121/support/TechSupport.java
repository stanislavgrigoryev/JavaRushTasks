package com.javarush.task.jdk13.task41.task4121.support;

public abstract class TechSupport {
    private TechSupport nextLevel;

    public abstract void solve(String problem);

    public TechSupport setNextLevel(TechSupport nextLevel) {
        return this.nextLevel = nextLevel;
    }

    protected void passAlongTheChain(String problem) {
        if (nextLevel != null) {
            setNextLevel(nextLevel).solve(problem);
        }
    }
}
