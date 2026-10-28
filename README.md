# KaatibDocsPro

A unified Android document suite bringing together a Kaatib-style UX with document processing capabilities inspired by ClearPDF, Apache Tika, and PDF-to-Word conversion workflows.

## What is included
- Android app shell with Compose UI
- Document list and file-management workflow
- PDF tools section
- Document viewer placeholder and metadata screen
- Text extraction screen with backend-ready hook
- PDF-to-Word conversion workflow placeholder
- Room + DataStore foundation
- Retrofit API layer foundation
- Backend service stubs for FastAPI

## Project architecture
- App module: Android UI and navigation
- Data layer: Room database, repository, settings store
- Network layer: Retrofit + Moshi API templates
- Backend: Tika extraction service and PDF-to-Word conversion service

## Run the Android app
1. Open the repository in Android Studio.
2. Let Gradle sync.
3. Ensure JDK 17 is configured.
4. Choose an emulator or physical device.
5. Run the app module.

## Run backend services
### Tika service
```bash
cd backend/tika-service
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn main:app --reload --host 0.0.0.0 --port 8001
```

### PDF-to-Word service
```bash
cd backend/pdf2word-service
python -m venv .venv
source .venv/bin/activate
pip install -r requirements.txt
uvicorn main:app --reload --host 0.0.0.0 --port 8002
```

## Upcoming production steps
- Real PDF viewer integration
- Real file picker and permission flow
- Real Tika API endpoint integration
- Real PDF-to-Word backend integration
- Better Arabic localization and design polish
- Room persistence for full document history

## Repository status
This repository now contains the operational foundation for a complete mobile document management app and is ready to be expanded through the implementation stages described in the docs.
