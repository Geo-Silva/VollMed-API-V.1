package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroMedico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //padrão de 4 a 6 digítios númericos
        String crm,
        @NotNull //não é NotBlank porque o mesmo é somente para Strings
        Especialidade especialidade,
        @NotNull
        @Valid //validar da mesma forma que foi feita aqui dentro da classe a seguir
        DadosEndereco endereco) {


}
