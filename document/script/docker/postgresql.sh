#!/usr/bin/env bash
docker run -d `# Docker Container 를 Daemon 으로 구동` \
  --name=postgresql `# Docker 관리를 위한 이름을 postgresql 로 지정` \
  -e POSTGRES_PASSWORD=password `# 기본 비밀번호를 설정` \
  -p 5432:5432 `# Docker Container 외부에서 Postgresql 접속을 위한 포트 개방` \
  postgres:latest `# postgres 최신 버젼을 이용`