# KaatibDocsPro backend services

This folder contains the supporting backend services that complete the Android app ecosystem.

## Included services

### 1. Apache Tika service
Used for text extraction and metadata extraction from PDFs and office documents.

### 2. PDF to Word service
Used for converting PDF files into DOCX via a Python-based conversion pipeline.

## Recommended deployment
- Local development: run via Python + FastAPI
- Production: deploy to a lightweight server or containerized service
- Android app: call these services through Retrofit API endpoints

## Example endpoints
- /extract
- /convert
- /health

