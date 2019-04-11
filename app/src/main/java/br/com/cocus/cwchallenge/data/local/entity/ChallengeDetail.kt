package br.com.cocus.cwchallenge.data.local.entity

import java.util.*
import kotlin.collections.ArrayList

data class ChallengeDetail(
        val id: String,
        val name: String,
        val slug: String,
        val category: String,
        val publishedAt: Date,
        val approvedAt: Date,
        val languages: ArrayList<String>,
        val url: String,
        val rank: RankMin,
        val createdBy: CreatedOrApproved,
        val approvedBy: CreatedOrApproved,
        val description: String,
        val totalAttempts: Int,
        val totalCompleted: Int,
        val totalStars: Int,
        val tags: ArrayList<String>
)