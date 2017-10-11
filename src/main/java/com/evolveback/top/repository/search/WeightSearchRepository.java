package com.evolveback.top.repository.search;

import com.evolveback.top.domain.Weight;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Weight entity.
 */
public interface WeightSearchRepository extends ElasticsearchRepository<Weight, Long> {
}
