package com.yanvictor.HelpDesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.yanvictor.HelpDesk.api.security.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {

	Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);
}
