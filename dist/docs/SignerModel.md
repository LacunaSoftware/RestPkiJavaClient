

# SignerModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageDigest** | [**DigestAlgorithmAndValueModel**](DigestAlgorithmAndValueModel.md) |  |  [optional] |
|**signature** | [**SignatureAlgorithmAndValueModel**](SignatureAlgorithmAndValueModel.md) |  |  [optional] |
|**signaturePolicy** | [**SignaturePolicyIdentifierModel**](SignaturePolicyIdentifierModel.md) |  |  [optional] |
|**signingTime** | **OffsetDateTime** |  |  [optional] |
|**certifiedDateReference** | **OffsetDateTime** |  |  [optional] |
|**timestamps** | [**List&lt;CadesTimestampModel&gt;**](CadesTimestampModel.md) |  |  [optional] |
|**isDocumentTimestamp** | **Boolean** |  |  [optional] |
|**signatureFieldName** | **String** |  |  [optional] |
|**validationResults** | [**ValidationResultsModel**](ValidationResultsModel.md) |  |  [optional] |
|**hasLtv** | **Boolean** |  |  [optional] |
|**xmlSignedEntityType** | **XmlSignedEntityTypes** |  |  [optional] |
|**xmlSignedElement** | [**XmlElementModel**](XmlElementModel.md) |  |  [optional] |
|**attributeCertificates** | [**List&lt;AttributeCertificateModel&gt;**](AttributeCertificateModel.md) |  |  [optional] |
|**certificate** | [**CertificateModel**](CertificateModel.md) |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] |



