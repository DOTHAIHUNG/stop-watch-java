public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long start() {
        this.startTime = System.currentTimeMillis();
        return this.startTime;
    }

    public long end() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        System.out.println(stopWatch.start());
        int[] array = new int[100000];
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                }
            }

        }
        System.out.println(stopWatch.end());

        System.out.println(stopWatch.getElapsedTime());
    }
}
