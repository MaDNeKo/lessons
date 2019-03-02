import java.util.ArrayList;
import java.util.List;

public class Heap
{
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

    private void siftDown()
    {
        int i = 0;
        int size =  arr.size();
        while (i < arr.size())
        {
            int left = i * 2 + 1;
            int right = left + 1;
            if (left < size && arr.get(i) < arr.get(left) ||
                right < size && arr.get(i) < arr.get(right))
            {
                boolean isRight = right < size &&
                        arr.get(right) > arr.get(left);
                if (isRight)
                {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(right));
                    arr.set(right, temp);
                }
                else
                {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(left));
                    arr.set(left, temp);
                }
                i = isRight ? right : left;
            }
            else break;
        }
    }

    public void add(int num)
    {
        arr.add(num);
        siftUp();
    }

    public boolean isEmpty()
    { return arr.size() == 0; }

    public int peekMax()
    { return arr.get(0);  }

    public int extractMax()
    {
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size()-1));
        arr.remove(arr.size()-1);
        siftDown();
        return temp;
    }
}
