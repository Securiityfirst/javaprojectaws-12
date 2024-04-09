import org.nd4j.util.ArchiveUtils;
import java.io.File;
public class Unzipper {
    public static void main(String[] args) throws Exception {
        Butler butler = new Butler();
        butler.welcome();
        // https://app.snyk.io/vuln/SNYK-JAVA-ORGND4J-72550
        // should appear as Reachable
        ArchiveUtils.unzipFileTo("./malicious_file.zip", "./unzipped/");
        File f = new File("/myDirectory/myfile.txt");  // Compliant

File.createTempFile("prefix", "suffix", new File("/mySecureDirectory"));  // Compliant

if(SystemUtils.IS_OS_UNIX) {
  FileAttribute<Set<PosixFilePermission>> attr = PosixFilePermissions.asFileAttribute(PosixFilePermissions.fromString("rwx------"));
  Files.createTempFile("prefix", "suffix", attr); // Compliant
}
else {
  File f = Files.createTempFile("prefix", "suffix").toFile();  // Compliant
  f.setReadable(true, true);
  f.setWritable(true, true);
  f.setExecutable(true, true);
}
        if (f.exists()) {
            throw new Exception("Malicious file /tmp/evil.txt was created");
        };
    }
}

