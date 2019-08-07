package models

import io.swagger.annotations.ApiModelProperty

import scala.annotation.meta.field

case class ModelWOptionBoolean(
                                @ApiModelProperty(dataType = "Boolean") optBoolean: Option[Boolean],
                                optBooleanWO: Option[Boolean],
                                aSeq: Seq[Boolean],
                                aArray: Array[Boolean],
                                aList: java.util.List[Boolean],
                                aOptionSeq: Option[Seq[Boolean]],
                                aSeqOption: Seq[Option[Boolean]],
                                aOptionList: Option[List[Boolean]],
                                aListOption: List[Option[Boolean]])
