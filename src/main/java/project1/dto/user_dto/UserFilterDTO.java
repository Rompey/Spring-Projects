package project1.dto.user_dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import project1.dto.address_dto.AddressDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserFilterDTO {
    private String searchName;
    private AddressDTO address;
}