import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate a = LocalDate.now();
        LocalDate b = LocalDate.of(2020, 1, 1);
        LocalDate c = LocalDate.of(2021, 2, 3);
        LocalDate d = LocalDate.of(2022, 9, 17);
        LocalDate e = LocalDate.of(2023, 5, 21);
        LocalDate f = LocalDate.of(2020, 7, 8);
        LocalDate g = LocalDate.of(2020, 6, 6);
        LocalDate h = LocalDate.of(2020, 4, 5);

        List<LocalDate> unsorted = new ArrayList<LocalDate>();
        unsorted.add(a);
        unsorted.add(b);
        unsorted.add(c);
        unsorted.add(d);
        unsorted.add(e);
        unsorted.add(f);
        unsorted.add(g);
        unsorted.add(h);

        DateSorter dateSorter = new DateSorter();
        List<LocalDate> sorted = dateSorter.sortDates(unsorted).stream().toList();
        System.out.println(sorted);
    }
}
