package dev.johnkyaw.UploadPDF.service;

import jakarta.persistence.Access;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.apache.pdfbox.pdmodel.PDDocument.*;

@Service
@Slf4j
public class UploadService {
    private final static String FILE_EXTENSION = ".pdf";

    public void encryptPDFFile(String path, String filename, MultipartFile multipartFile, String clientID) throws IOException {
        boolean isFilePDF = isFilePDF(filename);
        if(isFilePDF) {
            String fullPath = path + "/" + clientID;
            //create directory
            createDirectory(fullPath);

            //load pdf file
            InputStream inputStream = multipartFile.getInputStream();
            PDDocument pdDocument = PDDocument.load(inputStream);

            //creating instance of accesspermission
            AccessPermission ap = new AccessPermission();

            //creating instance of standardprotectionpolicy
            StandardProtectionPolicy stpp = new StandardProtectionPolicy("test", "test", ap);
            stpp.setEncryptionKeyLength(128);
            stpp.setPermissions(ap);
            pdDocument.protect(stpp);
            pdDocument.save(fullPath + "/" + filename);
            pdDocument.close();
        } else {
            throw new IOException("The file should have PDF format.");
        }
    }

    private static void createDirectory(String dirPath) {
        Path p = Paths.get(dirPath);
        if (!Files.isDirectory(p, LinkOption.NOFOLLOW_LINKS)) {
            try {
                Files.createDirectory(p);
            } catch (IOException e) {
                log.error("Creating directory failed: {} ", e.getMessage());
            }
        }
    }

    private static boolean isFilePDF(String fileName) {
        return fileName != null && fileName.endsWith(FILE_EXTENSION);
    }
}
