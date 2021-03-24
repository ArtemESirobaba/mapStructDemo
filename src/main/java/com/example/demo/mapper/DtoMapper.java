package com.example.demo.mapper;

import java.util.List;

/**
 * Contract for a generic dto to entity mapper.
 *
 * @param <D> - Dto type parameter.
 * @param <A> - Applying type parameter.
 */

public interface DtoMapper<D, A> {


  A toApplying(D dto);

  D toDto(A applying);

  List<A> toApplying(List<D> dtoList);

  List<D> toDto(List<A> applyingList);
}
