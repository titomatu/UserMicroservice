package io.tamatu.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class UserDto {
    Long id;
    String email;
    String nombre;
    String apellido;
    Date fecha;
}
