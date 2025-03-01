package com.shop.bookstore.catalog.model;

import java.util.List;

public record PagedResult<T>(
        List<T> data,
        long totalElements,
        int pageNumber,
        int totalPage,
        boolean isFirst,
        boolean isLast,
        boolean hasNext,
        boolean hasPrevious
) {
}
