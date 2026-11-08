public class ResultProcessor {
    private static int processedCount = 0;

    public synchronized void processResult(String facultyName) {
        System.out.println(facultyName + " is processing a result.");
        processedCount++;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.out.println(facultyName + " was interrupted while processing.");
            return;
        }

        System.out.println("Processed count: " + processedCount);
    }

    public static void main(String[] args) throws InterruptedException {
        ResultProcessor processor = new ResultProcessor();

        Thread facultyA = createFacultyThread(processor, "Faculty A");
        Thread facultyB = createFacultyThread(processor, "Faculty B");
        Thread facultyC = createFacultyThread(processor, "Faculty C");

        facultyA.start();
        facultyB.start();
        facultyC.start();

        facultyA.join();
        facultyB.join();
        facultyC.join();

        System.out.println("Total processed count: " + processedCount);
    }

    private static Thread createFacultyThread(ResultProcessor processor, String facultyName) {
        return new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                processor.processResult(facultyName);
            }
        }, facultyName);
    }
}
