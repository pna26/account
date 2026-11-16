package store.account;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true)
public record AccountOut(

    String id,
    String name,
    String email,
    // papel da conta para o RBAC: "USER" (padrão) ou "ADMIN"
    String role

) {

}
