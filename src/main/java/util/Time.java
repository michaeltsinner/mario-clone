package util;

public class Time {
    // Time at application start
    public static float timeStarted = System.nanoTime();

    // Time elapsed since application started converted to seconds
    public static float getTime() { return (float)((System.nanoTime() - timeStarted) * 1E-9); }
}
