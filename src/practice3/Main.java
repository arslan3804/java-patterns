package practice3;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        setLockExample();
//        mapSemaphoreExample();
    }

    private static void setLockExample() throws InterruptedException {
        SetLock<Integer> mySet = new SetLock<>();

        Thread one = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                mySet.add(i);
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 5000; i < 10000; i++) {
                mySet.add(i);
            }
        });
        Thread three = new Thread(() -> {
            for (int i = 10000; i < 15000; i++) {
                mySet.add(i);
            }
        });
        Thread four = new Thread(() -> {
            for (int i = 15000; i < 20000; i++) {
                mySet.add(i);
            }
        });
        one.start();
        two.start();
        three.start();
        four.start();
        one.join();
        two.join();
        three.join();
        four.join();

        for (Integer element : mySet) {
            System.out.println(element);
        }
    }

    private static void mapSemaphoreExample() throws InterruptedException {
        MapSemaphore<Integer, Integer> myMap = new MapSemaphore<>(1);
        Thread five = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                myMap.put(i, -i);
            }
        });
        Thread six = new Thread(() -> {
            for (int i = 5000; i < 10000; i++) {
                myMap.put(i, -i);
            }
        });
        Thread seven = new Thread(() -> {
            for (int i = 10000; i < 15000; i++) {
                myMap.put(i, -i);
            }
        });
        Thread eight = new Thread(() -> {
            for (int i = 15000; i < 20000; i++) {
                myMap.put(i, -i);
            }
        });
        five.start();
        six.start();
        seven.start();
        eight.start();
        five.join();
        six.join();
        seven.join();
        eight.join();

        Integer[] keysArray = myMap.keySet().toArray(new Integer[0]);

        for (Integer key : keysArray) {
            System.out.println(key + " " + myMap.get(key));
        }
    }
}
