package com.etiya.rentacar.core.business.paging;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageInfo {
    private int page;
    private int size;
}
