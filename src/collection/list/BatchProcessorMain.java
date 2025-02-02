package collection.list;


public class BatchProcessorMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //MyLinkedList<Integer> list = new MyLinkedList<>();

        BatchProcessor batchProcessor = new BatchProcessor(list);
        batchProcessor.logic(50_000);



    }
}
