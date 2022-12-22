package n_1_2;

public class idNumber {
    Student[] mas;

    public idNumber(int count)
    {
        mas = new Student[count];
        for (int i = 0; i < count; i++) mas[i] = new Student("Name " + i, "SecondName " + i, 900000 + 3000 + i*100 + 1, i%4, 2100 + i, 100-10*(count-i-2));
    }

    public void to_string()
    {
        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i].toString());
        }
        System.out.println();
    }

    public void mergeSort(Student[] mas, int left, int right)
    {
        int delimiter = left + ((right - left) / 2) + 1;

        if (delimiter > 0 && right > (left + 1))
        {
            mergeSort(mas, left, delimiter - 1);
            mergeSort(mas, delimiter, right);
        }

        Student[] buffer = new Student[right - left + 1];

        int cursor = left;
        for (int i = 0; i < buffer.length; i++)
        {
            if (delimiter > right || mas[cursor].getSum() > mas[delimiter].getSum())
            {
                buffer[i] = mas[cursor];
                cursor++;
            }
            else
            {
                buffer[i] = mas[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, mas, left, buffer.length);
    }

    public void quickSort(Student[] mas, int leftBorder, int rightBorder)
    {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student p = mas[(leftMarker + rightMarker) / 2];
        do {

            while (mas[leftMarker].getSum() > p.getSum()) leftMarker++;

            while (mas[rightMarker].getSum() < p.getSum()) rightMarker--;

            if (leftMarker <= rightMarker)
            {
                if (leftMarker < rightMarker)
                {
                    Student temp = mas[leftMarker];
                    mas[leftMarker] = mas[rightMarker];
                    mas[rightMarker] = temp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) quickSort(mas, leftMarker, rightBorder);

        if (leftBorder < rightMarker) quickSort(mas, leftBorder, rightMarker);

    }
}
