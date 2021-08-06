package org.gso.brinder.common.dto;

import java.net.URI;

import lombok.Data;

@Data
public abstract class PageDto {

    private int pageSize;
    private int totalElements;
    private URI next;

}
