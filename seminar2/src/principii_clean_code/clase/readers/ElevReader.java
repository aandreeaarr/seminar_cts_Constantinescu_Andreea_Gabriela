package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicant(String name) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(name));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();
        while (input2.hasNext()) {
            Elev elev = new Elev();
            super.readerAplicant(input2,elev);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        input2.close();
        return elevi;
    }
}
