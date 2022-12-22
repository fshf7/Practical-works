package n2;

public class SortingStudentsByGPA implements Comparator{
    Student[] mas;

    public SortingStudentsByGPA(int count)
    {
        mas = new Student[count];
        for (int i = 0; i < count; i++)
        {
            mas[i] = new Student((i+2)*10, "testName #" + i);
        }
    }

    @Override
    public void quickSort(Student[] mas, int leftBord, int rightBord)
    {
        int leftMarker = leftBord;
        int rightMarker = rightBord;
        int mid = mas[(leftMarker + rightMarker) / 2].sum;
        do {

            while (mas[leftMarker].sum > mid)
            {
                leftMarker++;
            }

            while (mas[rightMarker].sum < mid)
            {
                rightMarker--;
            }

            if (leftMarker <= rightMarker)
            {
                if (leftMarker < rightMarker)
                {
                    Student tmp = mas[leftMarker];
                    mas[leftMarker] = mas[rightMarker];
                    mas[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBord) quickSort(mas, leftMarker, rightBord);
        if (leftBord < rightMarker) quickSort(mas, leftBord, rightMarker);
    }

    public void out()
    {
        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i].to_string());
        }
    }
}
