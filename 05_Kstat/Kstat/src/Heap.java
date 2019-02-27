import java.util.ArrayList;
import java.util.List;

public class Heap
{
    //private int size;
    //TODO: redo to simple array
    private List<Integer> arr;

    public Heap () {
        //size = 0;
        arr = new ArrayList<>();
    }

    private void siftUp()
    {
        int i = arr.size() - 1;
        while (i > 0)
        {
            int parent = (i - 1) / 2;
            if (arr.get(i) > arr.get(parent))
            {
                int temp = arr.get(i);
                arr.set(i, arr.get(parent));
                arr.set(parent, temp);
                i = parent;
            }
            else break;
        }
    }

    public void add(int num)
    {
        arr.add(num);
        siftUp();
    }

    //TODO
    //isEmpty
    //peekMin
    //extractMin
    //siftDown
}
