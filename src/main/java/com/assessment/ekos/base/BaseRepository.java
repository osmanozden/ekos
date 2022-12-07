package com.assessment.ekos.base;import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.data.jpa.repository.JpaSpecificationExecutor;import org.springframework.data.repository.CrudRepository;import org.springframework.data.repository.PagingAndSortingRepository;import java.io.Serializable;public interface BaseRepository<T extends BaseEntity, PK extends Serializable>        extends PagingAndSortingRepository<T, PK>,        JpaRepository<T, PK>,        JpaSpecificationExecutor<T>,        CrudRepository<T, PK> {}