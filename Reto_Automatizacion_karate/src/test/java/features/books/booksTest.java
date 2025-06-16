package features.books;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class booksTest {
    @Test
    public void testParallel() {
        String[] featureFiles = {
                "classpath:features/books/post-authentication.feature",
                "classpath:features/books/post-submit-order.feature",
                "classpath:features/books/patch-update-order.feature",
                "classpath:features/books/delete-order.feature",
                "classpath:features/books"

        };

        Results results = Runner.path(featureFiles)  // Pasa el arreglo
                .outputCucumberJson(true)
                .tags("~@ignore")
                .parallel(1);  // Ejecución en paralelo
        generateReport(results.getReportDir());
        Assertions.assertEquals(0, results.getFailCount(), results.getErrorMessages());

    }

    public static void generateReport(String karateOutputPath) {
        Collection<File> jsonFiles = FileUtils.listFiles(new File(karateOutputPath), new String[]{"json"}, true);
        List<String> jsonPaths = new ArrayList<String>(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
        Configuration config = new Configuration(new File("target"), "pruebas get user");
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }

}