import java.util.zip.ZipFile;
import java.util.zip.ZipEntry;
⋮
public void extract(ZipFile zip) {
     ⋮
     String toDir = "/my/target/directory/";
     Enumeration entries = zip.entries();
     while (entries.hasMoreElements()) {
        ZipEntry zipEntry = entries.nextElement();
        ⋮
        File file = new File(toDir, zipEntry.getName())
	try{ 
        	InputStream istr = zipFile.getInputStream(zipEntry);
	}catch(Exception e) {
	}
        final OutputStream os = Files.newOutputStream(file.toPath());
        bos  = new BufferedOutputStream(os);
	//copy streams
        IOUtils.copy(bis, bos);
	
    }
}
