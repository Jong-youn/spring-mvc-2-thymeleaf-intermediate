package hello.itemservice.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeliveryCode {

    /**
     FAST, NORMAL, SLOW
     */

    private String code;
    private String displayName;
}
