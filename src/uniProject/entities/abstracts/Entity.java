package uniProject.entities.abstracts;

import java.io.Serializable;

public interface Entity extends Serializable {

    /**
     *
     * <p>
     *     Nesneyi {@code System.out.println()} ile yazdırmak için yazılması gereken metod
     * </p>
     *
     * @return String: nesnenin bilgilerini bir String' de toplar ve bu String' i döndürür
     */
    String toString();
}
