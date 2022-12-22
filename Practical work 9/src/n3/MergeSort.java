package n3;

public class MergeSort {
    Student mas1[];
    Student mas2[];
    Student[] mas;

    public MergeSort(Student[] mas1, Student[] mas2)
    {
        this.mas1 = mas1;
        this.mas2 = mas2;
        mas = new Student[mas1.length + mas2.length];
    }

    public void array()
    {
        for (int i = 0; i < mas1.length; i++) mas[i] = mas1[i];
        for (int i = mas1.length; i < mas.length; i++) mas[i] = mas2[i- mas1.length];
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
            if (delimiter > right || mas[cursor].ID > mas[delimiter].ID)
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

    public void to_string()
    {
        for (int i = 0; i < mas.length; i++)
        {
            System.out.println(mas[i].to_string());
        }
    }
}
