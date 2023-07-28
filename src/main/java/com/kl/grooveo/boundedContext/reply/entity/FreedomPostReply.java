package com.kl.grooveo.boundedContext.reply.entity;

import java.time.LocalDateTime;

import com.kl.grooveo.boundedContext.comment.entity.FreedomPostComment;
import com.kl.grooveo.boundedContext.member.entity.Member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class FreedomPostReply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	private FreedomPostComment freedomPostComment;

	@ManyToOne
	private Member author;

	@Column(columnDefinition = "TEXT")
	private String content;

	private LocalDateTime createDate;
	private LocalDateTime deleteDate;
}
