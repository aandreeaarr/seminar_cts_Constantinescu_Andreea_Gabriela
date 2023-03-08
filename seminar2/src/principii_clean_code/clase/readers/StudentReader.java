package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicant(String name) throws FileNotFoundException {
        Scanner input = new Scanner(new File(name));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student student = new Student();
            super.readerAplicant(input,student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
