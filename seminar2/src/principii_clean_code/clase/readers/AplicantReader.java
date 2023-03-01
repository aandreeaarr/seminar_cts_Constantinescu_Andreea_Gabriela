package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public interface AplicantReader {

    List<Aplicant> readAplicant(String name) throws FileNotFoundException;
}
