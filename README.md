# KaatibDocsPro

KaatibDocsPro is a unified Android document management application that combines the original Kaatib app foundation with a professional document-processing toolkit.

## Included capabilities
- PDF viewing and management
- Merge, split, and compress PDF files
- Office document support (DOCX, XLSX, PPTX)
- Text extraction using Apache Tika
- PDF-to-Word conversion via a backend service
- Document scanning and image tools
- Local document archive and file history
- Arabic-ready UI with Material 3

## Source project roles
### Kaatib
- App shell and user experience
- Main navigation and home flow

### ClearPDF
- PDF tools and document processing core

### Apache Tika
- Metadata and text extraction service

### pdf2word
- PDF-to-Word conversion pipeline

## Current project status
The repository now includes the following implemented stages:
- Android app shell
- Compose navigation graph
- Document home and file list
- PDF tools screen
- Document viewer placeholder with metadata card
- Extraction screen with result presentation
- Conversion screen with progress-state interactions
- Document repository and DataStore support
- Room database foundation for saved document history
- Retrofit service skeleton for external document APIs

## Suggested stack
- Kotlin
- Jetpack Compose
- Material 3
- Retrofit
- Room
- DataStore
- Apache Tika + Python conversion backend

## Next stage recommendations
1. Add a real PDF rendering engine and document picker
2. Connect actual file operations for PDF merge/split/compress
3. Replace sample extraction data with a live Tika API call
4. Add progress and completion states for conversion jobs
5. Add Arabic localization and polish UI/UX

## Repository target
This repository is intended to host the final integrated Android product while the original reference projects continue to serve as technical sources and feature inspiration.
