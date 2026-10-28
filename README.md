# KaatibDocsPro

KaatibDocsPro is a unified Android document platform that brings together the best ideas from Kaatib, ClearPDF, Apache Tika, and PDF-to-Word conversion workflows.

## Project vision
The app is designed to work as a modern document suite for mobile users, allowing them to:
- open and browse PDF and office files
- extract text and metadata from documents
- convert PDFs into Word files
- merge, split, compress, and manage PDF tools
- archive and view document history
- work with Arabic-first interfaces and mobile workflows

## Included sources and roles
### Kaatib
- app shell and user flow
- Arabic-first UX and general navigation

### ClearPDF
- PDF handling logic and document processing concepts
- merge, split, compress, scan, viewer capabilities

### Apache Tika
- metadata extraction and content extraction
- support for PDF, DOCX, XLSX, PPTX and related formats

### pdf2word
- document conversion backend workflow
- PDF to Word conversion service pattern

## App features
- home dashboard
- document list
- PDF tools dashboard
- document viewer screen
- text extraction screen
- conversion screen
- data persistence layer
- settings management via DataStore
- backend API skeleton for future real integration

## Repository structure
```text
Onerevers-/
├── app/
│   ├── src/main/AndroidManifest.xml
│   ├── src/main/java/com/kaatibdocspro/
│   ├── src/main/res/values/
│   └── build.gradle.kts
├── backend/
│   ├── README.md
│   ├── tika-service/
│   │   ├── main.py
│   │   ├── README.md
│   │   └── requirements.txt
│   └── pdf2word-service/
│       ├── main.py
│       ├── README.md
│       └── requirements.txt
├── docs/
│   ├── ARCHITECTURE.md
│   ├── START_HERE.md
│   └── INTEGRATION_PLAN.md
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── .gitignore
├── README.md
└── app/proguard-rules.pro
```

## Technology stack
- Kotlin
- Jetpack Compose
- Material 3
- Navigation Compose
- Room
- DataStore
- Retrofit
- Moshi
- OkHttp logging
- FastAPI for backend services

## Run instructions
### Android app
1. Open the repository in Android Studio
2. Let Gradle sync
3. Select an Android emulator or device
4. Run the app module

### Backend services
For the Tika service:
```bash
cd backend/tika-service
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn main:app --reload --host 0.0.0.0 --port 8001
```

For the PDF-to-Word service:
```bash
cd backend/pdf2word-service
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn main:app --reload --host 0.0.0.0 --port 8002
```

## API flow
- Android app sends document to extraction service
- extraction service processes text and metadata
- app can then save content or display it
- conversion service receives PDF and returns DOCX file path or result payload

## Production advice
For a true production-ready implementation, use:
- Full PDF engine integration
- Real Tika server deployment
- Real PDF conversion backend
- Secure file storage and permission handling
- Real document upload and download APIs
- Android Storage Access Framework for file selection

## Current status
This repository is now structured as a practical mobile app foundation and backend integration prototype. It is ready to be expanded into a full production project.
